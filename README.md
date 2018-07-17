# ZHZClassText
智海舟公司测试Demo

        本次设计有层级关系，还是仅上下层！！！
        
数据关系：表结构
		简单处理表：	
			代理商表：
				adminId			代理商编号		int	
				adminName		代理商姓名/账号		String
				password		代理商密码		String
				phone			手机号			String
				adress			地址			String
				levelId			上级代理商		int

			商户表：
				userId			商户编号		int
				userName		商户姓名/账号		String
				password		商户密码		String
				phone			手机号			String
				address			地址			String
				levelId			上级代理商		int		
				rate			费率			double	


		收银表：（rank表）
		rankId			编号		int
		rankMoney		交易金额	double
		codeId			商户交易人	int
		userId			代理商交易人	int
		rankDate		交易时间	datetime
		rate			费率		double --按照百分之五的费率运算
    
    
    
    demo文件夹为前台页面      --WebStorm
    shopdemo为后台           --采用SSM框架  
        Myecilpse10开发，  有些代码接口基本为测试代码。
        前台用Vue绑值
        模拟收银，无二维码。以查询账单为准
        
        本项目还在更新中。
          
