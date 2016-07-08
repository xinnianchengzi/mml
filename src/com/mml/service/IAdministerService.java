package com.mml.service;

import java.util.List;
import com.mml.entity.Administer;
import com.mml.entity.Memberuser;
import com.mml.entity.Seller;
import com.mml.entity.Grades;
import com.mml.entity.Goods;
import com.mml.entity.Categorya;
import com.mml.entity.Categoryb;
import com.mml.entity.Orders;
import com.mml.entity.Viewboard;
import com.mml.entity.Promotion;
import com.mml.entity.Coupon;
import com.mml.entity.Gift;

public interface IAdministerService {
	//����Աģ��
	public Administer SuperAdministerLogin(Administer administer);//��������Ա��¼
	public Administer NormalAdminiterLogin(Administer administer);//��ͨ����Ա��¼
	public Administer AdministerRegist(Administer administer);//����Աע��
	public List<Administer> GetAdministerList();//������й���Ա�б��Ƿ�ͨ����֤��ǰ̨���֣�
	public Administer VerifyAdminister(Integer adminid);//ͨ������Աע��
	public Administer RefuseAdminister(Integer adminid);//�ܾ�����Աע��
	//�û�����ģ��
	public List<Memberuser> GetMemberList();//����û���Ϣ�б�
	public List<Grades> GetGradesList();//��û�Ա�ȼ���Ϣ�б�
	public void ModifyGrades(Integer gradesid,Integer grades);//�޸ĵȼ�������Ӧ�ȼ���Ӧ�Ļ�������
	//�̼ҹ���ģ��
	public List<Seller> GetRegistedSellerList();//��������̼��б��Ƿ�ͨ����֤��ǰ̨���֣�
	public void DeleteSeller(Integer sellerid);//ɾ����ע���̼ң����ṩ��ע���̼Ҹýӿڣ�δע���̼ҽ��ھܾ���֤��ͬʱɾ����
	public String GetRegistFile(Integer sellerid);//����̼��ϴ���ע���ļ�·��
	public void RefuseSeller(Integer sellerid);//�ܾ��̼�ע��
	//��Ʒ����ģ��
	public List<Goods> GetGoodsListByAdmin();//�����Ʒ�б�
	public void DeleteGoodsByAdmin(Integer goodsid);//����Աɾ����Ʒ��ͬʱɾ����ض���������
	public List<Categorya> GetCategorya();//���һ������б�
	public List<Categoryb> GetCategoryb();//��ö�������б�
	public void AddCategorya(String name);//���һ�����
	public void AddCategoryv(Integer categorya,String name);//��Ӷ������,������������е�һ�������
	public void DeleteCategorya(Integer categorya);//ɾ��һ�����(��ȷ�ϸ����������Ʒ�ſ�ɾ����ͬʱɾ���������)
	public void DeleteCategoryb(Integer categoryb);//ɾ�����������ȷ�ϸ����������Ʒ�ſ�ɾ����
	//��������ģ��
	public List<Orders> GetAllOrders();
	public List<Orders> GetOrdersBySeller(Integer sellerid);//���̼Ҳ�ѯ����
	public List<Orders> GetOrdersByMember(Integer memberid);//���û���ѯ����
	public void DeleteOrders(Integer ordersid);
	//���԰����
	public List<Viewboard> GetViewboard();//������԰��б���Ա���̼���ǰ�����֣�
	public void ModifyState(Integer viewboardid);//���Ĵ���״̬
	public void DeleteViewboard(Integer viewboardid);//ɾ�����԰�
	//�̳ǻ����
	public Coupon UpdateCoupon(Coupon coupon);//�ϴ��Ż�ȯ
	public Gift UpdateGift(Gift gift);//�ϴ���Ʒ
	public List<Promotion> GetPromotion();//���ƽ̨�������Ϣ������û�У�
	public Promotion UpdatePromotion(Promotion promotion);//����ƽ̨�����	
}
