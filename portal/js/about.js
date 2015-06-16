// (function(){
//     var init = function(curHash, list){
//       $('.nav-left .nav-list a').removeClass('active');
//       $('.nav-left .nav-list a[href='+ curHash +']').addClass('active');
//       $(list).hide();
//       $(curHash).show();
//     };
//   window.onload = function(){
//     list = '.about-part';
//     var currentHash = window.location.hash;
//     var hashes = ['#contact', '#partners', '#friendlinks', '#userAgreement'];
//     if(hashes.indexOf(currentHash) < 0){
//       currentHash = '#contact';
//     }
//     init(currentHash, list);

//     $('.nav-list a').each(function(){
//       $(this).click(function(){
//         if($(this).hasClass('active')){
//           return;
//         }
//         currentHash = $(this).attr('href');
//         init(currentHash, list)
//       });
//     });
//     $(window).bind('hashchange', function(){
//       currentHash = window.location.hash;
//       init(currentHash, list);
//     });
//   };
// })();

(function(){
    window.onload = function(){
      var pre = '\/doc\/about\/';
      var currentHash = window.location.pathname.replace(pre, '');
      var hashes = ['knowus', 'contact', 'partners', 'friendlinks'];
      if(hashes.indexOf(currentHash) < 0){
        currentHash = 'knowus';
      }
      $('.nav-left .nav-list a[href="'+ pre + currentHash +'"]').addClass('active');
      $('#' + currentHash).show();
    };
})();