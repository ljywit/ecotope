package com.base.dal.mybatis;

import com.base.dal.object.AbstractDO;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 数据访问层接口
 * 
 * @author Administrator
 *
 * @param <T>
 * @param <PK>
 */
public interface BaseDao<T extends AbstractDO, PK extends java.io.Serializable> {

	/** 插入 */
	int insert(T model) throws Exception;

	/**
	 * 删除
	 * 
	 * @return
	 */
	int delete(PK modelPK) throws Exception;

	/** 主键查询 */
	T load(PK modelPK) throws Exception;

	int update(T model) throws Exception;

	int updateSelective(T model) throws Exception;

	int countAll() throws Exception;

	List<T> findAll() throws Exception;

	List<PK> findAllIds();

	/**
	 * 分页查询数据
	 * 
	 * @param query
	 *            查询条件
	 * @param rb
	 * @return
	 */
	List<T> findPageBreakByCondition(Object query, RowBounds rb) throws Exception;

	/**
	 * 查询条件下的总数目，用于分页
	 * 
	 * @param query
	 * @return
	 */
	int findNumberByCondition(Object query) throws Exception;

}
