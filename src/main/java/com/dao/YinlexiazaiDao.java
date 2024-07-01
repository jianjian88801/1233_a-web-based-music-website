package com.dao;

import com.entity.YinlexiazaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinlexiazaiVO;
import com.entity.view.YinlexiazaiView;


/**
 * 音乐下载
 * 
 * @author 
 * @email 
 * @date 2021-05-08 17:07:13
 */
public interface YinlexiazaiDao extends BaseMapper<YinlexiazaiEntity> {
	
	List<YinlexiazaiVO> selectListVO(@Param("ew") Wrapper<YinlexiazaiEntity> wrapper);
	
	YinlexiazaiVO selectVO(@Param("ew") Wrapper<YinlexiazaiEntity> wrapper);
	
	List<YinlexiazaiView> selectListView(@Param("ew") Wrapper<YinlexiazaiEntity> wrapper);

	List<YinlexiazaiView> selectListView(Pagination page,@Param("ew") Wrapper<YinlexiazaiEntity> wrapper);
	
	YinlexiazaiView selectView(@Param("ew") Wrapper<YinlexiazaiEntity> wrapper);
	
}
