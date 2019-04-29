//package pusanit.bigdata.myapp;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class CustomerManagerIII {
//
//	//�� ������ ������ �ڷᱸ�� ����
//	static ArrayList<Customer> custList = new ArrayList<>();
//
//	//����Ʈ ������ ��ȸ�ϱ� ���� �ε����� �ʿ�� ��
//	static int index = -1;
//
//	static int count = 0;//custList.size()
//
//	//�⺻ �Է���ġ�κ��� �����͸� �Է¹ޱ� ���� Scanner��ü ����
//	static Scanner scan = new Scanner(System.in);
//
//	public static void main(String[] args) {
//
//		while(true) {
//			count = custList.size();
//			System.out.printf("\n[INFO] �� �� : %d, �ε��� : %d\n", count, index);
//			System.out.println("�޴��� �Է��ϼ���.");
//			System.out.println("(I)nsert, (P)revious, (N)ext, " +
//					"(C)urrent, (U)pdate, (D)elete, (Q)uit");
//			System.out.print("�޴� �Է�: ");
//			String menu = scan.next();
//			menu = menu.toLowerCase();	//�Է��� ���ڿ��� ��μҹ��ڷ� ��ȯ
//			switch(menu.charAt(0)) {
//			case 'i':
//				System.out.println("������ �Է��� �����մϴ�.");
//				insertCustomerData();
//				System.out.println("�������� �Է��߽��ϴ�.");
//				break;
//			case 'p' :
//				System.out.println("���� �����͸� ����մϴ�.");
//				if(index <= 0) {
//					System.out.println("���� �����Ͱ� �������� �ʽ��ϴ�.");
//				}else {
//					index--;
//					printCustomerData(index);
//				}
//				break;
//			case 'n' :
//				System.out.println("���� �����͸� ����մϴ�.");
//				if(index >= count-1) {
//					System.out.println("���� �����Ͱ� �������� �ʽ��ϴ�.");
//				}else {
//					index++;
//					printCustomerData(index);
//				}
//				break;
//			case 'c' :
//				System.out.println("���� �����͸� ����մϴ�.");
//				if( (index >= 0) && (index < count)) {
//					printCustomerData(index);
//				}else {
//					System.out.println("����� �����Ͱ� ���õ��� �ʾҽ��ϴ�.");
//				}
//				break;			
//			case 'u' :
//				System.out.println("�����͸� �����մϴ�.");
//				if( (index >= 0) && (index < count)) {
//					System.out.println(index + "��° �����͸� �����մϴ�.");
//					updateCustomerData(index);
//				}else {
//					System.out.println("������ �����Ͱ� ���õ��� �ʾҽ��ϴ�.");
//				}
//				break;
//			case 'd' :
//				System.out.println("�����͸� �����մϴ�.");
//				if( (index >= 0) && (index < count)) {
//					System.out.println(index + "��° �����͸� �����մϴ�.");
//					deleteCustomerData(index);
//				}else {
//					System.out.println("������ �����Ͱ� ���õ��� �ʾҽ��ϴ�.");
//				}
//				break;
//			case 'q' :
//				System.out.println("���α׷��� �����մϴ�.");
//				scan.close();	//Scanner ��ü�� �ݾ��ش�.
//				System.exit(0);	//���α׷��� �����Ų��.
//				break;	
//			default : 
//				System.out.println("�޴��� �� �� �Է��߽��ϴ�.");	
//			}//end switch
//		}//end while
//	}//end main
//
//	public static void insertCustomerData() {
//		System.out.print("�̸� : ");	
//		String name = scan.next();
//		System.out.print("����(M/F) : ");	
//		char gender = scan.next().charAt(0);
//		System.out.print("�̸��� : ");	
//		String email = scan.next();
//		System.out.print("����⵵ : ");	
//		int birthYear = scan.nextInt();
//
//		//�Է¹��� �����ͷ� �� ��ü�� ����
//		Customer cust = new Customer(name, gender, email, birthYear);
//
//		//�� ��ü�� ArrayList�� ����
//		custList.add(cust);
//	}
//
//	//�������� ���
//	public static void printCustomerData(int index) {
//		Customer cust = custList.get(index);
//		System.out.println("==========CUSTOMER INFO================");
//		System.out.println("�̸� : " + cust.getName());
//		System.out.println("���� : " + cust.getGender());
//		System.out.println("�̸��� : " + cust.getEmail());
//		System.out.println("����⵵ : " + cust.getBirthYear());
//		System.out.println("=======================================");
//	}
//
//	//index ��ġ�� �������� �����մϴ�.
//	public static void deleteCustomerData(int index) {
//		custList.remove(index);
//	}
//
//	//index ��ġ�� �� ������ �����մϴ�.
//	public static void updateCustomerData(int index) {
//		Customer cust = custList.get(index);
//		System.out.println("---------UPDATE CUSTOMER INFO----------");
//		System.out.print("�̸�(" + cust.getName() + ") :");
//		cust.setName(scan.next());
//
//		System.out.print("����(" + cust.getGender() + ") :");
//		cust.setGender(scan.next().charAt(0));
//
//		System.out.print("�̸���(" + cust.getEmail() + ") :");
//		cust.setEmail(scan.next());
//
//		System.out.print("����⵵(" + cust.getBirthYear() + ") :");
//		cust.setBirthYear(scan.nextInt());		
//	}
//
//}
