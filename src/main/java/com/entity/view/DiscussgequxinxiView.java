package com.entity.view;

import com.entity.DiscussgequxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 歌曲信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 17:07:13
 */
@TableName("discussgequxinxi")
public class DiscussgequxinxiView  extends DiscussgequxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussgequxinxiView(){
	}
 
 	public DiscussgequxinxiView(DiscussgequxinxiEntity discussgequxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussgequxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
