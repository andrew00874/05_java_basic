package edu.inheritance.ex0;

// 상속 : 부모의 코드를 물려받아 자식이 자신의 것처럼 사용

// 상속 키워드 : extends ( 확장하다 )
//               -> 부모 코드를 자식이 물려 받아
//                  자식의 전체 크기가 증가 (코드가 증가한다는 의미)

public class Dev extends Employee {
    //필드
    private String computer; // 직원 중에 개발자는 컴퓨터가 추가로 필요
    //메서드
    //기본 생성자
    public Dev(String eName, int eId, double baseSalary, String department, String computer){
        /*
        * super() : Employee에 존재하는 생성자를 가리킴
        * - 자식 객체 생성 시 부모 생성자를 호출하는 생성자
        *
        * 1) super() : 직원 클래스 안에 존재하는 기본 생성자
        * 2) super(매개변수) : 직원 클래스 안에 존재하는 파라미터 생성자 의미
        * */
        super(eName, eId, baseSalary, department);
        /*
        this 대신 super를 사용해서 매개변수로 전달받은 eName, eId, baseSalary, department 사용하겠다.
        this.eName = eName;
        this.eId = eId;
        this.baseSalary = baseSalary;
        this.department = department;
        * */
        this.computer = computer; //this를 여러번 작성할 필요 없이 직원 클래스에 1번만 작성하고
        // 추가로 클래스내에서 작성된 필드만 this로 작성하면 됨
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public void info(){
        super.info(); //직원클래스에서 기존 info() 기능에 작성한 텍스트를 호출함
        System.out.println("computer: "+getComputer());
    }

    @Override
    public void work(){
        super.work();
        System.out.println(geteName() + " 개발자가" + getComputer() + " 로 코딩을합니다.");
    }

    public void codeReview(){
        System.out.println(geteName() + " 개발자가 코드 리뷰를 진행합니다.");
    }
}
