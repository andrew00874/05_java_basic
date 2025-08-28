package edu.oop.field.pack3.ex;

public class ShoppingMallMember {
    public static int totalMemberCount;
    public static int dailyVisitorCount;

    public static final String SHOPPING_MALL_NAME = "더조은 온라인 쇼핑몰";
    public static final String SERVICE_CENTER_NUMBER = "1588-1234";
    public static final int MAX_CART_ITEMS = 50;
    public static final int MIN_PASSWORD_LENGTH = 8;

    private String memberId;
    private String memberName;
    private String email;
    private int cartItemCount;

    {
        memberId = "guest123";
        memberName = "게스트";
        email = "guest@tjemail.com";
        cartItemCount = 0;
    }

    static {
        totalMemberCount = 0;
        dailyVisitorCount = 0;
        System.out.println("=== " + SHOPPING_MALL_NAME + " 시스템 시작 ===");
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCartItemCount() {
        return cartItemCount;
    }

    public void setCartItemCount(int cartItemCount) {
        this.cartItemCount = cartItemCount;
    }

    public void joinMember(){
        System.out.println(getMemberName() + "님이 회원가입하셨습니다. (회원번호 : " + getMemberId() + ")");
        totalMemberCount++;
    }

    public void visitSite(){
        dailyVisitorCount++;
        System.out.println(getMemberName() + "님이 사이트를 방문했습니다.");
    }

    public void addToCart(int itemCount){
        if (MAX_CART_ITEMS >= getCartItemCount() + itemCount) {
            setCartItemCount(getCartItemCount()+ itemCount);
            System.out.println(getMemberName() +"님이 장바구니에 " + itemCount + "개 상품을 추가했습니다.");
        }else {
            System.out.println("장바구니 최대 수량 (" + MAX_CART_ITEMS +"개)를 초과할 수 없습니다." );
        }
    }

    public void printMemberInfo(){
        System.out.println(getMemberName() + "님은 장바구니에 " + getCartItemCount() +"개의 물건이 있습니다.");
    }

    public void ultSetter(String memberName, String memberEmail, String memberId){
        setMemberId(memberId);
        setMemberName(memberName);
        setEmail(memberEmail);
    }
}
