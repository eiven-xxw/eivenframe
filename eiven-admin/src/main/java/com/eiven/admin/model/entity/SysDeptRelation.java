package com.eiven.admin.model.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 */
@Data
@TableName("sys_dept_relation")
public class SysDeptRelation extends Model<SysDeptRelation> {

    private static final long serialVersionUID = 1L;

    /**
     * 祖先节点
     */
	private Integer ancestor;
    /**
     * 后代节点
     */
	private Integer descendant;


	@Override
	protected Serializable pkVal() {
		return this.ancestor;
	}

	@Override
	public String toString() {
		return "SysDeptRelation{" +
			", ancestor=" + ancestor +
			", descendant=" + descendant +
			"}";
	}
}
