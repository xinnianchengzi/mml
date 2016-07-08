package com.mml.service;

import java.util.List;
import com.mml.entity.Goods;
import com.mml.entity.Advertisement;
import com.mml.entity.Promotion;
import com.mml.entity.Categorya;
import com.mml.entity.Categoryb;
import com.mml.entity.Comment;
import com.mml.entity.Seller;
import com.mml.entity.Viewboard;
public interface IAllUserService {
	//�˳���¼
	public void Logout(Integer id);//��Ա���̼ҡ�����Ա����������Ա��ʹ�øýӿ��˳���¼
	//�����û����ƽ̨��ҳ��ʾ������
	public Promotion GetPromotion();//���ƽ̨�����Ļ
	public List<Advertisement> GetAdvertisement();//��ù�棨�û���ͨ����������̼�ID�����̼���ҳ��
	public List<Categorya> GetCategorya();//�����Ʒһ������
	public List<Categoryb> GetCategpryb();//�����Ʒ��������
	public List GetGoodsTag();//�����Ʒ��������Ʒ�ƣ���ǰ��ѡȡ������ҳ
	public List<Goods> GetGoodsByTime();//�����Ʒ�б�������ʱ������ǰ�˴�Ϊȫ�ֱ�����
	
	//��Ʒ�б�����
	public List<Goods> GetGoodsBySell();//������������ʾ���������������δ������ĵ���Ʒ
	/*���۸�������ǰ�����*/
	/*������Ʒ�ö�Ҳ��ǰ����ɣ�ǰ������������ֶ��ǵ�������ɲ�ѯ��Ʒ������һ������һ���*/
	
	//��Ʒ����
	/*���һ�����
	     ����������
	     ��Ʒ�Ʋ�ѯ
	     ���������ùؼ��������������У���Ʒ������Ʒ��������ƷƷ�ƣ���Ʒһ�������Ʒ������𣨽���������*/
	
	//��Ʒ����鿴
	/*����ȡ����Ʒ�б�ʱ���и���Ʒ��Ϣ���˶�����ǰ�����*/
	public List<Comment> GetGoodsComment(Integer goodsid);//��ȡ��Ʒ�����б�
	
	//�����̼���ҳ
	public Seller GetSeller(Integer sellerid);//�û�ͨ������������̼�ҳ�棬�̼���Ϣ�а������̼���ҳ����ͼƬ����Ϣ
	public List<Goods> GetGoodsOfSeller(Integer sellerid);//����̼ҵ���Ʒ�б�*�̼ҿ�����
	
	//���԰巴��
	public Viewboard WriteView(String message);//��¼���û����ԣ����ݵ�¼��Ϣ��������û���Ϣ
}
