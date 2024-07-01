package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinlexiazaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinlexiazaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinlexiazaiView;


/**
 * 音乐下载
 *
 * @author 
 * @email 
 * @date 2021-05-08 17:07:13
 */
public interface YinlexiazaiService extends IService<YinlexiazaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinlexiazaiVO> selectListVO(Wrapper<YinlexiazaiEntity> wrapper);
   	
   	YinlexiazaiVO selectVO(@Param("ew") Wrapper<YinlexiazaiEntity> wrapper);
   	
   	List<YinlexiazaiView> selectListView(Wrapper<YinlexiazaiEntity> wrapper);
   	
   	YinlexiazaiView selectView(@Param("ew") Wrapper<YinlexiazaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinlexiazaiEntity> wrapper);
   	
}

