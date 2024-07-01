package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgequxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgequxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgequxinxiView;


/**
 * 歌曲信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-08 17:07:13
 */
public interface DiscussgequxinxiService extends IService<DiscussgequxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgequxinxiVO> selectListVO(Wrapper<DiscussgequxinxiEntity> wrapper);
   	
   	DiscussgequxinxiVO selectVO(@Param("ew") Wrapper<DiscussgequxinxiEntity> wrapper);
   	
   	List<DiscussgequxinxiView> selectListView(Wrapper<DiscussgequxinxiEntity> wrapper);
   	
   	DiscussgequxinxiView selectView(@Param("ew") Wrapper<DiscussgequxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgequxinxiEntity> wrapper);
   	
}

