package com.licunzhi.service;

import java.util.List;

/**
 * ������dao�ӿ� ��װdao�еķ���
 * @author LiCunzhi
 *
 * @param <T>
 */
public interface BaseService<T> {
//	д����
	public void saveEntity(T t);
	public void saveOrUpdateEntity(T t);
	public void updateEntity(T t);
	public void deleteEntity(T t);
	public void batchEntityByHQL(String hql,Object ... objects);
	
//	������
	public T loadEntity(Integer id);
	public T getEntity(Integer id);
	public List<T> findEntityByHQL(String hql,Object ... objects);
//	��ֵ������ѯ
	public Object uniqueResult(String hql,Object ... objects);
}