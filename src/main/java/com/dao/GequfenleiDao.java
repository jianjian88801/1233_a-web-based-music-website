package com.dao;

import com.entity.GequfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GequfenleiVO;
import com.entity.view.GequfenleiView;


/**
 * 歌曲分类
 * 
 * @author 
 * @email 
 * @date 2021-05-08 17:07:13
 */
public interface GequfenleiDao extends BaseMapper<GequfenleiEntity> {
	
	List<GequfenleiVO> selectListVO(@Param("ew") Wrapper<GequfenleiEntity> wrapper);
	
	GequfenleiVO selectVO(@Param("ew") Wrapper<GequfenleiEntity> wrapper);
	
	List<GequfenleiView> selectListView(@Param("ew") Wrapper<GequfenleiEntity> wrapper);

	List<GequfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<GequfenleiEntity> wrapper);
	
	GequfenleiView selectView(@Param("ew") Wrapper<GequfenleiEntity> wrapper);
	
}
