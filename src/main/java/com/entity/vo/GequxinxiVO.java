package com.entity.vo;

import com.entity.GequxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 歌曲信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-08 17:07:13
 */
public class GequxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 海报
	 */
	
	private String haibao;
		
	/**
	 * 歌曲分类
	 */
	
	private String gequfenlei;
		
	/**
	 * 歌手
	 */
	
	private String geshou;
		
	/**
	 * 作词
	 */
	
	private String zuoci;
		
	/**
	 * 作曲
	 */
	
	private String zuoqu;
		
	/**
	 * 音乐
	 */
	
	private String yinle;
		
	/**
	 * 视频
	 */
	
	private String shipin;
		
	/**
	 * 歌曲简介
	 */
	
	private String gequjianjie;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：海报
	 */
	 
	public void setHaibao(String haibao) {
		this.haibao = haibao;
	}
	
	/**
	 * 获取：海报
	 */
	public String getHaibao() {
		return haibao;
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
	 * 设置：作词
	 */
	 
	public void setZuoci(String zuoci) {
		this.zuoci = zuoci;
	}
	
	/**
	 * 获取：作词
	 */
	public String getZuoci() {
		return zuoci;
	}
				
	
	/**
	 * 设置：作曲
	 */
	 
	public void setZuoqu(String zuoqu) {
		this.zuoqu = zuoqu;
	}
	
	/**
	 * 获取：作曲
	 */
	public String getZuoqu() {
		return zuoqu;
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
				
	
	/**
	 * 设置：视频
	 */
	 
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
				
	
	/**
	 * 设置：歌曲简介
	 */
	 
	public void setGequjianjie(String gequjianjie) {
		this.gequjianjie = gequjianjie;
	}
	
	/**
	 * 获取：歌曲简介
	 */
	public String getGequjianjie() {
		return gequjianjie;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
