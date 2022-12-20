//그룹웨어 서비스를 관리하는 프로그램을 CLI 에서 구동가능하도록 작성하기
//
//그룹웨어 서비스의 확장으로 다양한 기능을 가진 관리 프로그램이 필요하게 되었습니다.
//
//그룹웨어 서비스 관리 프로그램은 다양한 고객사의 정보를 등록, 변경, 삭제 할수 있는 프로그램을 작성해주세요.
//
//그룹웨어 서비스의 주요 관리 데이터는 "고객사명",  "사업자번호", "마스터계정", "마스터계정 비밀번호", "API 타입"을 관리해야합니다.
//
//그룹웨어  서비스는 외부 API 에 따라 별도의 구성이 필요합니다.
//현재는 'Kwic' 과 'CodeF' 두가지 타입의 API 구성 요소가 있습니다.
//API 타입에 따라 별도의 연결체를 구현해 주세요
//(이부분은 어려우시면 고려 안하시고 작성 가능합니다)
//
//위 데이터를 읽기, 추가,  변경, 삭제 기능을 구현해 주세요
//
//아래 테스트케이스 클래스가 정상 작동할 수 있게 구현 바랍니다.


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {
//    Groupware[] groupwares = new Groupware[5];
        List<Groupware> groupwares = new ArrayList<Groupware>();
        groupwares.add(new Groupware(1,"t1","A회사", "A","1234","KWIC", true));
        groupwares.add(new Groupware(2,"t2","B회사", "B","1234","KWIC", true));
        groupwares.add(new Groupware(3,"t3","C회사", "C","1234","CODEF", false));
        groupwares.add(new Groupware(4,"t4","D회사", "D","1234","KWIC", true));
        groupwares.add(new Groupware(5,"t5","E회사", "E","1234","CODEF", true));

        int sentinalValue = 1;
        Scanner scanner = new Scanner(System.in);
        while (sentinalValue != 0){
            System.out.println("기능을 선택해주세요. 1 : 서비스 추가, 2 : 서비스 삭제, 3 : 서비스 서버 종료, 4 : 계정, 비밀번호 변경, 0 : 프로그램 종료");
            sentinalValue = scanner.nextInt();
            printAll(groupwares);
            switch (sentinalValue){
                case 1 :
                    System.out.println("서비스를 추가합니다.");
                    System.out.println("회사 아이디를 입력해주세요");
                    int companyId = scanner.nextInt();
                    System.out.println("회사 이름을 입력해주세요");
                    String companyName = scanner.next();
                    Groupware addGroupware = new Groupware(companyId, companyName, "1234","1234","1234", "false", false);
                    groupwares.add(addGroupware);
                    break;
                case 2:
                    System.out.println("서비스를 삭제합니다.");
                    System.out.println("회사 아이디를 입력해주세요");
                    scanner.nextLine();
                    Groupware removeGroupware = new Groupware(scanner.nextInt(), scanner.next(), "1234","1234","1234", "false", false);
                    groupwares.remove(removeGroupware);
                    break;
                case 3:
                    System.out.println("서비스의 서버를 종료합니다.");
                    companyId = scanner.nextInt();
                    groupwares.get(companyId - 1).setServerStatus(false);
                    break;
                case 4:
                    System.out.println("계정명, 계정 비밀번호를 변경합니다.");
                    System.out.println("변경할 고객사 id: ");
                    scanner.nextInt();
                    Groupware setGroupware = new Groupware(scanner.nextInt(), scanner.next(), "1234","1234","1234", "false", false);
                    groupwares.set(setGroupware);
                    break;
            }
        }
    }

    private static void printAll(List<Groupware> groupwares){
        for(Groupware groupware : groupwares){
            System.out.printf("id : %d | %s | %s" , groupware.getCompanyId(), groupware.getCompanyName(), groupware.getServerStatus());
            System.out.println();
        }
    }
}