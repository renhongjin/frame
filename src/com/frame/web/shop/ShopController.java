package com.frame.web.shop;

import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.frame.bean.Comment;
import com.frame.bean.CommentStatusType;
import com.frame.bean.Shop;
import com.frame.bean.common.JsonResult;
import com.frame.dao.model.CommentStatusEntity;
import com.frame.service.impl.CommentService;
import com.frame.service.impl.ShopService;
import com.frame.utils.PageUtils;

/**
 * 店铺相关控制器
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/shop")
public class ShopController{
  
  private Logger log = Logger.getLogger(ShopController.class);
  
  @Autowired
  private ShopService shopService;
  
  @Autowired
  private CommentService commentService;
  /**
   * 获取店铺列表
   * @return 店铺列表信息
   */
  @ResponseBody
  @RequestMapping("/shoplist.html")
  public JsonResult<List<Shop>> getShopList(@RequestBody Map<String, Object> params){
    JsonResult<List<Shop>> result = new JsonResult<List<Shop>>();
    try{
      params = PageUtils.getPageIndexAndPageNum(params);
      Integer currrentPage = (Integer)params.get("page");
      Integer pageNum = (Integer)params.get("pageNum");
      log.info("获取店铺列表查询参数："+JSON.toJSONString(params));
      List<Shop> shops = shopService.getShopList(params);
      int count = shopService.getShopCount(params);
      
      result.setCurrrentPage(currrentPage);
      result.setPageCount(count);
      result.setData(shops);
      result.setPageNum(pageNum);
      result.setMsg("success");
      result.setStatus(0);
    }catch(Exception e){
      log.error("获取店铺信息列表异常:",e);
      result.setMsg("系统异常");
      result.setStatus(1);
    }
    return result;
  }
  
  /**
   * 店铺详细信息
   */
  @ResponseBody
  @RequestMapping("/shopinfo.html")
  public JsonResult<Shop> getAllShopInfo(@RequestParam String shopId,@RequestParam String openId){
    JsonResult<Shop> result = new JsonResult<Shop>();
    try{
      log.info("获取店铺详情参数shopId:"+shopId+",openId："+openId);
      Shop shop = shopService.getShopAllInfoById(shopId);
      //获取该用户是否在该店铺下的评论中有点赞或者反对操作,并设置到对应的评论实体中
      List<CommentStatusEntity> commentStatus = commentService.getCommentStatus(shop.getShopInfo().getId(),openId);
      if(commentStatus != null && commentStatus.size() > 0){
        for(CommentStatusEntity commentStatusEntity:commentStatus){
          int status = commentStatusEntity.getStatus();
          String commentId = commentStatusEntity.getCommentId();
          if(CommentStatusType.NOT_GOOD_ANDNOT_BAD.intValue() != status){
            List<Comment> comments = shop.getShopInfo().getCommentList(); 
            for(Comment comment:comments){
              if(commentId.equals(comment.getId())){
                comment.setStatus(status);
                break;
              }
            }
          }
        }
      }
      
      result.setData(shop);
      result.setStatus(0);
      result.setMsg("success");
    }catch(Exception e){
      log.error("获取店铺详细信息:",e);
      result.setMsg("系统异常");
      result.setStatus(1);
    }
    return result;
  }
}
