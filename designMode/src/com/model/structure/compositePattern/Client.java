package com.model.structure.compositePattern;

public class Client {

	public static void main(String[] args) {
		Company root = new ConcreteCompany();
        root.setName("�����ܹ�˾");
        root.add(new HRDepartment("�ܹ�˾������Դ��"));
        root.add(new FinanceDepartment("�ܹ�˾����"));
        Company shandongCom = new ConcreteCompany("ɽ���ֹ�˾");
        shandongCom.add(new HRDepartment("ɽ���ֹ�˾������Դ��"));
        shandongCom.add(new FinanceDepartment("ɽ���ֹ�˾����"));
        Company zaozhuangCom = new ConcreteCompany("��ׯ���´�");
        zaozhuangCom.add(new FinanceDepartment("��ׯ���´�����"));
        zaozhuangCom.add(new HRDepartment("��ׯ���´�������Դ��"));
        Company jinanCom = new ConcreteCompany("���ϰ��´�");
        jinanCom.add(new FinanceDepartment("���ϰ��´�����"));
        jinanCom.add(new HRDepartment("���ϰ��´�������Դ��"));
        shandongCom.add(jinanCom);
        shandongCom.add(zaozhuangCom);
        Company huadongCom = new ConcreteCompany("�Ϻ������ֹ�˾");
        huadongCom.add(new HRDepartment("�Ϻ������ֹ�˾������Դ��"));
        huadongCom.add(new FinanceDepartment("�Ϻ������ֹ�˾����"));
        Company hangzhouCom = new ConcreteCompany("���ݰ��´�");
        hangzhouCom.add(new FinanceDepartment("���ݰ��´�����"));
        hangzhouCom.add(new HRDepartment("���ݰ��´�������Դ��"));
        Company nanjingCom = new ConcreteCompany("�Ͼ����´�");
        nanjingCom.add(new FinanceDepartment("�Ͼ����´�����"));
        nanjingCom.add(new HRDepartment("�Ͼ����´�������Դ��"));
        huadongCom.add(hangzhouCom);
        huadongCom.add(nanjingCom);
        root.add(shandongCom);
        root.add(huadongCom);
        root.display(0);
	}

}
