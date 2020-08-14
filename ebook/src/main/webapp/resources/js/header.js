$(function(){
            var id = $('#id').val();
            var isLogin = $('#isLogin').val();
            if(isLogin == 'false' && id != '')
                alert(id+'가 없거나 비밀번호가 잘못 되었습니다.')
                
            $('.search-btn').click(function(e){
                e.stopPropagation();
                e.preventDefault();
                $('.logNav').stop().slideUp(); 
            })
            $('.logNav-btn').click(function(e){
                e.stopPropagation();
                $('.search').stop().slideUp(); 
                $('.logNav').stop().slideToggle(); 
            })
            $('.search').click(function(e){
                e.stopPropagation();
                e.preventDefault();
                $('.search').slideDown();
            })
            $('.logNav').click(function(e){
 				e.stopPropagation();
                $('.logNav').slideDown();
            })
            $('.login-btn').click(function(){
            	$('.login-form').submit();
            })
        
        $(document).click(function(e){
                $('.search').stop().slideUp(); 
                $('.logNav').stop().slideUp(); 
        })
})