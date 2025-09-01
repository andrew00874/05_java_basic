package edu.practice.day6;

// 네이버 카페 클래스
class NaverCafe extends NaverService{
    private String cafeGrade;
    private int articleCount;

    public NaverCafe(){}

    public NaverCafe(String serviceName, String userId, String userNickname, int userLevel){
        super(serviceName, userId, userNickname, userLevel);
    }
    public NaverCafe(String serviceName, String userId, String userNickname, int userLevel, String cafeGrade, int articleCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.cafeGrade = cafeGrade;
        this.articleCount = articleCount;
    }

    public String getCafeGrade() {
        return cafeGrade;
    }

    public void setCafeGrade(String cafeGrade) {
        this.cafeGrade = cafeGrade;
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }

    @Override
    public void search() {
        System.out.println("카페에서 게시글을 검색합니다.");
    }

    @Override
    public void writeContent() {
        System.out.println("카페 게시글을 작성합니다.");
    }
    public void joinCafe(){
        System.out.println(getUserNickname() + "님이 카페에 가입했습니다.");
    }
    public void uploadFile() {
        System.out.println("파일이 업로드 되었습니다.");
    }

}