package com.mml.service;

import com.mml.entity.Goods;
import com.mml.entity.Orders;
import com.mml.entity.Comment;
public interface IBuyerService {
	//��Ա������Ʒ
	public void AddToChart(Goods goods,Integer number);//��Ա��Ʒ��ӵ����ﳵ(������Ʒ����),ͬʱ��Ʒ��Ϣ�м�����Ӧ����
	public Orders FromChartToOrders(Integer memberid);//�ɻ�Ա�Ĺ��ﳵ���ɶ���
	public Orders MemberPayOrders(Orders orders );//��Ա֧�����������Ȳ鿴�̼ҵ��Ż���Ϣ���ۿۡ����������ٸ���ѡ���֧����ʽ��ƽ̨֧����������֧�����������,ƽ̨֧���������ͻ�Ա�ȼ������Żݣ�������ƽ̨��ת������ƽ̨������������޸�
	//��ע���û�������Ʒ
	public Orders UserBuyGoods(Goods goods,Integer number);//δע���û�ֱ�ӹ���,���ɶ���ʱ�ö�������绰���Զ����ɵ�����������ʱ�û�
	public Orders UserPayOrders(Orders orders);//δע���û�֧�����������Ȳ鿴�̼ҵ��Ż���Ϣ���ۿۡ�������������ʵ��֧���Ľ��ٸ���ѡ���֧����ʽ��������ƽ̨֧�������������ĸ���״̬
	//ȷ���ջ�
	public Orders ConfirmGoodsReceive(Orders orders);
	//������Ʒ
	public Comment WriteComments(Integer ordersid);
}
