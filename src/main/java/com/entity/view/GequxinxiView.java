package com.entity.view;

import com.entity.GequxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 歌曲信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 17:07:13
 */
@TableName("gequxinxi")
public class GequxinxiView  extends GequxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GequxinxiView(){
	}
 
 	public GequxinxiView(GequxinxiEntity gequxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gequxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
