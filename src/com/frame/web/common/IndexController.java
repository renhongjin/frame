package com.frame.web.common;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import com.frame.bean.common.JsonResult;
import com.frame.utils.UUIDUtils;
import com.frame.web.shop.ShopController;

@Controller
@RequestMapping("/index")
public class IndexController {
  private Logger log = Logger.getLogger(ShopController.class);

  @Value("${upload.linux.path}")
  private String uploadPath;
  
  @ResponseBody
  @RequestMapping("/uploadImg")
  public JsonResult<List<String>> upload(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IllegalStateException, IOException{
    JsonResult<List<String>> result = new JsonResult<List<String>>();
    List<String> urls = new ArrayList<String>();
    try{
      CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
      //判断 request 是否有文件上传,即多部分请求  
      if(multipartResolver.isMultipart(request)){
        //转换成多部分request    
        MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
        //取得request中的所有文件名  
        Iterator<String> iter = multiRequest.getFileNames();
        //上传图片的保存路径
        String imagePath = uploadPath;
        File direct = new File(imagePath);
        if(!direct.exists()&&!direct.isDirectory()){
          direct.mkdirs();
        }
        while(iter.hasNext()){
          //记录上传过程起始时的时间，用来计算上传时间  
          int pre = (int)System.currentTimeMillis();
          //取得上传文件  
          MultipartFile file = multiRequest.getFile(iter.next());
          if(file!=null){
            //取得当前上传文件的文件名称  
            String originFilename = file.getOriginalFilename();
            //如果名称不为“”,说明该文件存在，否则说明该文件不存在  
            if(originFilename.trim() != ""){
              String extendName = originFilename.substring(originFilename.lastIndexOf('.')+1);//文件的后缀名称
              //重命名上传后的文件名  
              String fileName = UUIDUtils.nextUUID()+"."+extendName;
              String imgPath = imagePath+"/"+fileName;
              //定义上传路径  
              File imgFile = new File(imgPath);
              file.transferTo(imgFile);
              urls.add(fileName);
            }
          }
          //记录上传该文件后的时间  
          int finaltime = (int)System.currentTimeMillis();
          log.info("上传文件时间："+(finaltime-pre));
        }
      }
      result.setStatus(0);
      result.setData(urls);
      result.setMsg("upload success");
    }catch(Exception e){
      log.error("图片上传异常：" , e);
      result.setStatus(1);
      result.setMsg("系统异常");
    }
    return result;
  }
}
