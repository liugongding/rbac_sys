layui.use('laypage', function(){
    var laypage = layui.laypage;
    //执行一个laypage实例
    //完整功能
    laypage.render({
        elem: 'test1'
        ,count: 100
        ,layout: ['prev', 'page', 'next', 'limit', 'count']
        ,jump: function(obj){
            console.log(obj)
        }
    });
});