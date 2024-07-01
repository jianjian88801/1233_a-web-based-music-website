package com.entity.model;

import com.entity.YinlexiazaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 音乐下载
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-08 17:07:13
 */
public class YinlexiazaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 歌曲名称
	 */
	
	private String gequmingcheng;
		
	/**
	 * 歌曲分类
	 */
	
	private String gequfenlei;
		
	/**
	 * 歌手
	 */
	
	private String geshou;
		
	/**
	 * 音乐
	 */
	
	private String yinle;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：歌曲名称
	 */
	 
	public void setGequmingcheng(String gequmingcheng) {
		this.gequmingcheng = gequmingcheng;
	}
	
	/**
	 * 获取：歌曲名称
	 */
	public String getGequmingcheng() {
		return gequmingcheng;
	}
				
	
	/**
	 * 设置：歌曲分类
	 */
	 
	public void setGequfenlei(String gequfenlei) {
		this.gequfenlei = gequfenlei;
	}
	
	/**
	 * 获取：歌曲分类
	 */
	public String getGequfenlei() {
		return gequfenlei;
	}
				
	
	/**
	 * 设置：歌手
	 */
	 
	public void setGeshou(String geshou) {
		this.geshou = geshou;
	}
	
	/**
	 * 获取：歌手
	 */
	public String getGeshou() {
		return geshou;
	}
				
	
	/**
	 * 设置：音乐
	 */
	 
	public void setYinle(String yinle) {
		this.yinle = yinle;
	}
	
	/**
	 * 获取：音乐
	 */
	public String getYinle() {
		return yinle;
	}
			
}
