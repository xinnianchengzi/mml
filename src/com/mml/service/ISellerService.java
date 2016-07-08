package com.mml.service;

import java.math.BigDecimal;
import java.util.List;
import com.mml.entity.Seller;
import com.mml.entity.Orders;
import com.mml.entity.Goods;
import com.mml.entity.Comment;
import com.mml.entity.Discount;
import com.mml.entity.Fullcut;
public interface ISellerService {
	//�̼ҵ�¼ע��ģ��
	public Seller SellerLogin(String name,String password);//�̼�ע��
	public Seller SellerRegist(Seller seller);//�̼�ע��
	//�̼���Ϣ����
	public List<Seller> GetSellerInfo(Integer sellerid);//�̼���Ϣ
	public Seller ModifySellerInfo(Seller seller);//�޸��̼���Ϣ
	
	//�̼���Ʒ����ģ��
	public List<Orders> GetSellerOrders(Integer sellerid);//��ö�����Ϣ
	public List<Goods> GetSellerGoods(Integer sellerid);//�����Ʒ��Ϣ
	public Goods UpdateGoods(Goods goods);//��Ʒ�ϼ�
	public void DeleteGoodsBySeller(Integer goodsid);//��Ʒ�¼�
	public Goods ModifyGoodsInfo(Goods goods);//�޸���Ʒ��Ϣ
	public List<Comment>  GetSellerComment(Integer sellerid);//�����Ʒ����
	public Comment ReplyComment(String commentreply);//ͬ�û���Ʒ���ۣ�ֻ�Ǹ��ݵ�¼��ɫ�����۱�����Ӳ�ͬ���û���Ϣ
	public Seller ModifySellerPage(Seller seller);//�޸���ҳ��Ϣ
	public Seller UpdateAdvertisement(Seller seller);//���ϴ��˹����Ϣ,������Աͨ�����д�����
	
	//�̼Ҵ�����Ϣ��������û���ۿۺ�������
	public Discount AddDiscount(BigDecimal discount,Integer sellerid);//�����ۿ�
	public void DeleteDiscount(Integer sellerid);//ɾ���ۿۻ
	public Fullcut AddFulcut(BigDecimal full,BigDecimal cut);//��������
	public void DeleteFullcut(Integer sellerid);//ɾ�������
	
	//�̼�Ʒ�ƹ���*���Բ�ʵ��
	public List GetSellerTag(Integer sellerid);//����̼�����Ʒ��
	public List<Goods> GetGoodsWithTag(Integer sellerid,String tag);//�̼Ҳ鿴�Լ�Ʒ���µ���Ʒ
	public void DeleteTag(String tag);//ɾ��Ʒ�ƣ���Ӧɾ����Ʒ����������Ʒ�������Ϣ
	
}
