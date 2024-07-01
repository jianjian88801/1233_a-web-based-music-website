package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GequfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GequfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GequfenleiView;


/**
 * 歌曲分类
 *
 * @author 
 * @email 
 * @date 2021-05-08 17:07:13
 */
public interface GequfenleiService extends IService<GequfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GequfenleiVO> selectListVO(Wrapper<GequfenleiEntity> wrapper);
   	
   	GequfenleiVO selectVO(@Param("ew") Wrapper<GequfenleiEntity> wrapper);
   	
   	List<GequfenleiView> selectListView(Wrapper<GequfenleiEntity> wrapper);
   	
   	GequfenleiView selectView(@Param("ew") Wrapper<GequfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GequfenleiEntity> wrapper);
   	
}

