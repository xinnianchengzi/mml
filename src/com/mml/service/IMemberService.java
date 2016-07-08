package com.mml.service;

import java.util.List;
import com.mml.entity.Memberuser;
import com.mml.entity.Orders;
import com.mml.entity.Couponget;
import com.mml.entity.Gift;
public interface IMemberService {
	public Memberuser MemberLogin(String membername,String password);//��Ա��¼
	public Memberuser MemberRegist(Memberuser memberuser);//��Աע��
	//��Ա������Ϣ����ģ��
	public Memberuser GetMemberInfo(Integer memberid);//��û�Ա������Ϣ
	public List<Orders> GetMembersOrders(Integer memberid);//�鿴���׼�¼
	public Memberuser ModifyMemberInfo(Memberuser memberuser);//�޸Ļ�����Ϣ
	public List GetChartByMember(Integer memberid);//�鿴���ﳵ
	//��ȡ�Ż�ȯ
	public Couponget GetCoupon(Integer memberid,Integer sellerid);
	//��ȡ��Ʒ
	public List<Gift> GetGift();//�����Ʒ�б�
	public Gift AddGiftToChart(Integer giftid);//����Ʒ��ӵ����ﳵ
	
}
