package com.dao;

import com.entity.GequxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GequxinxiVO;
import com.entity.view.GequxinxiView;


/**
 * 歌曲信息
 * 
 * @author 
 * @email 
 * @date 2021-05-08 17:07:13
 */
public interface GequxinxiDao extends BaseMapper<GequxinxiEntity> {
	
	List<GequxinxiVO> selectListVO(@Param("ew") Wrapper<GequxinxiEntity> wrapper);
	
	GequxinxiVO selectVO(@Param("ew") Wrapper<GequxinxiEntity> wrapper);
	
	List<GequxinxiView> selectListView(@Param("ew") Wrapper<GequxinxiEntity> wrapper);

	List<GequxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GequxinxiEntity> wrapper);
	
	GequxinxiView selectView(@Param("ew") Wrapper<GequxinxiEntity> wrapper);
	
}
