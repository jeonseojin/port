<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="<%=request.getContextPath()%>/toon/payment" method="post" class="form-paymenet">
	<div class="payment-box display-none"></div>
	<div class="payment-item">
		<h2 class="payment-li">결제</h2>
		<div class="payment-tool">
		<h5>결제 수단 선택</h5>
		<button type="button" class="payment-tool-choice">
			<select class="choice-payment">
		        <option value="1">신용카드</option>
		        <option value="2">휴대폰 결제</option>
		        <option value="3">카카오 페이</option>
		        <option value="4">네이버 페이</option>
		        <option value="5">문화상품권</option>
		        <option value="6">해피머니</option>
		        <option value="7">도서문화상품권</option>
		        <option value="8">무통장입금</option>
		    </select>
			<span class="pay-choice-icon">변경<i class="fas fa-angle-down"></i></span>
			<span class="pay-choice-icon choice-icon-close display-none">닫기<i class="fas fa-angle-up"></i></span>
		</button>
		
		<div class="paymentchoice-help choice-card">
		    <span>신용카드 이용안내</span>
			<div class="help-paymentchoice">
				• 신용카드 결제 시 환경 및 카드사에 따라 ISP 또는 앱 카드 설치가 필요할 수 있습니다.<br>
				• NH채움카드는 비밀번호+CVC가 아닌 SMS+공인인증 절차만 가능합니다. 또한, 일별 4회 결제 / 1회 결제 시 5만원의 한도가 있습니다.(앱 카드 및 원클릭 결제 불가)<br>
				• 현대카드는 M포인트 사용이 가능하며, 청구 할인 방식으로 결제 됩니다. (결제 금액의 10%, 최대 1만 포인트 사용 가능)<br>
				• 법정대리인의 동의 없는 미성년자의 결제는 취소될 수 있습니다.<br>
				• 7일이내 사용하지 않은 코인에 대한 청약철회가 가능하며, 관련 조건 및 환불약관을 확인해주세요.<br>
				• 결제내역은 내 정보에서 확인 가능합니다.<br>
			</div>
		</div>
		
		<div class="paymentchoice-help choicepay-phone display-none">
		    <span>휴대폰결제 이용안내</span>
			<div class="help-paymentchoice">
				• 신용카드 결제 시 환경 및 카드사에 따라 ISP 또는 앱 카드 설치가 필요할 수 있습니다.
				<br>• 법정대리인의 동의 없는 미성년자의 결제는 취소될 수 있습니다.
				<br>• 7일이내 사용하지 않은 코인에 대한 청약철회가 가능하며, 관련 조건 및 환불약관을 확인해주세요.
				<br>• 결제내역은 내 정보에서 확인 가능합니다.
				<br>
			</div>
		</div>
		
		<div class="paymentchoice-help choicepay-cacao display-none">
		    <span>카카오페이 이용안내</span>
			<div class="help-paymentchoice">
				• 카카오페이는 카카오톡 설치 시 이용 가능하고, 휴대폰과 카드/계좌 명의자가 동일해야 합니다.
				<br>• 카카오머니로 결제 시 카카오톡에 연동된 휴대폰 번호로 현금 영수증이 발급됩니다.
				<br>• 농협 카드는 카드사 사정에 따라 사용 불가합니다.
				<br>• 관련 문의는 카카오페이 고객 센터(1644-7405)로 연락 부탁드립니다.
				<br>• 법정대리인의 동의 없는 미성년자의 결제는 취소될 수 있습니다.
				<br>• 7일이내 사용하지 않은 코인에 대한 청약철회가 가능하며, 관련 조건 및 환불약관을 확인해주세요.
				<br>• 결제내역은 내 정보에서 확인 가능합니다.
			</div>
		</div>
		
		<div class="paymentchoice-help display-none choicepay-naver">
		    <span>네이버페이 이용안내</span>
			<div class="help-paymentchoice">
				• 네이버페이는 네이버 로그인 절차가 진행될 수 있습니다.
				<br>• 신용카드, 계좌이체, 네이버페이포인트로 결제 가능합니다. 단, 포인트는 결제만 가능하며 적립은 불가능합니다.
				<br>• 계좌이체로 결제한 경우 현금영수증 발급 가능하며, 현금영수증은 구매 확정 절차에서 발급 가능합니다.
				<br>• 카카오뱅크카드로 결제한 경우 결제내역에 국민카드로 표시될 수 있습니다.
				<br>• 관련 문의는 네이버페이 고객센터(1588-3819) 로 연락 부탁드립니다.
				<br>• 법정대리인의 동의 없는 미성년자의 결제는 취소될 수 있습니다.
				<br>• 7일이내 사용하지 않은 코인에 대한 청약철회가 가능하며, 관련 조건 및 환불약관을 확인해주세요.
				<br>• 결제내역은 내 정보에서 확인 가능합니다.
			</div>
		</div>
		
		<div class="paymentchoice-help display-none choicepay-culture">
		    <span>문화상품권 이용안내</span>
			<div class="help-paymentchoice">
				<br>• 문화 상품권은 (주)한국문화진흥원에서 발행하는 상품권입니다.
				<br>• 컬쳐랜드에 회원 가입 후 사용 가능합니다.
				<br>• 컬쳐랜드 아이디에 충전한 컬쳐캐쉬로 결제할 수 있습니다.
				<br>• 관련 문의는 컬쳐랜드 고객센터(1577-2111) 로 연락 부탁드립니다.
				<br>• 법정대리인의 동의 없는 미성년자의 결제는 취소될 수 있습니다.
				<br>• 7일이내 사용하지 않은 코인에 대한 청약철회가 가능하며, 관련 조건 및 환불약관을 확인해주세요.
				<br>• 결제내역은 내 정보에서 확인 가능합니다.
			</div>
		</div>
		
		<div class="paymentchoice-help choicepay-happy">
		    <span>해피머니 이용안내</span>
			<div class="help-paymentchoice">
				<br>• 해피머니는 해피머니 서비스 회원 가입 후 사용 가능합니다.
				<br>• 관련 문의는 해피머니 아이엔씨 고객 센터(1588-5245)로 연락 부탁드립니다.
				<br>• 법정대리인의 동의 없는 미성년자의 결제는 취소될 수 있습니다.
				<br>• 7일이내 사용하지 않은 코인에 대한 청약철회가 가능하며, 관련 조건 및 환불약관을 확인해주세요.
				<br>• 신용카드 결제 시 환경 및 카드사에 따라 ISP 또는 앱 카드 설치가 필요할 수 있습니다.
				<br>• 결제내역은 내 정보에서 확인 가능합니다.
			</div>
		</div>
		
		<div class="paymentchoice-help">
		    <span>휴대폰결제 이용안내</span>
			<div class="help-paymentchoice">
				• 신용카드 결제 시 환경 및 카드사에 따라 ISP 또는 앱 카드 설치가 필요할 수 있습니다.
				<br>• 법정대리인의 동의 없는 미성년자의 결제는 취소될 수 있습니다.
				<br>• 7일이내 사용하지 않은 코인에 대한 청약철회가 가능하며, 관련 조건 및 환불약관을 확인해주세요.
				<br>• 결제내역은 내 정보에서 확인 가능합니다.
			</div>
		</div>
		
		<div class="paymentchoice-help">
		    <span>휴대폰결제 이용안내</span>
			<div class="help-paymentchoice">
				• 신용카드 결제 시 환경 및 카드사에 따라 ISP 또는 앱 카드 설치가 필요할 수 있습니다.
				<br>• 법정대리인의 동의 없는 미성년자의 결제는 취소될 수 있습니다.
				<br>• 7일이내 사용하지 않은 코인에 대한 청약철회가 가능하며, 관련 조건 및 환불약관을 확인해주세요.
				<br>• 결제내역은 내 정보에서 확인 가능합니다.
			</div>
		</div>
		
		<button type="submit">충전</button>
		</div>

		<input type="hidden" name="p_charging">
		<input type="hidden" name="p_price">
	</div>
</form>
<script>
	$(document).click(function(e){
	    $('.payment-item').addClass('display-none');
	    $('.payment-box').addClass('display-none');
	    $('.payment-item').children('.toon-pay-btn').remove();
	})
	$('.payment-item').click(function(e){
    	e.stopPropagation();
    })
    $(function(){
        $('.payment-tool-choice').click(function(){
            $('.pay-choice-icon').toggleClass('display-none');
            $('.pay-choice-icon .choice-icon-close').toggleClass('display-none');
        })
    })
</script>