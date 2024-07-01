package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 歌曲信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-08 17:07:13
 */
@TableName("gequxinxi")
public class GequxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GequxinxiEntity() {
		
	}
	
	public GequxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 歌曲名称
	 */
					
	private String gequmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
