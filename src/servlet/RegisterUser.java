package servlet;

import javax.servlet.http.HttpServletRequest;

@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException{
			
	//フォワード先
	String forwardPath = null;
	
	//サーブレットクラスの動作を決定するactionの値を
	//リクエストパラメータから取得
	String action = request.getParameter("action");
		
	
	//登録の内容をリクエストされた時の処理
	if(action ==null){
		
		//フォワード先を設定
		forwardPath = "/WEB-INF/jsp/registerForm.jsp";
	}
	
	//登録画面から登録実行をリクエストした時の処理
	else if(action.equals("done")){
		//セッションスコープに保存された登録ユーザーを取得
		HttpSession session = request.getSession();
	    User registerUser = (User) session.getAttribute
	    		("registerUser");
	    
	    //登録情報の呼び出し
	    RegisterUserLogic logic = new RegisterUserLogic();
	    logic.register(registerUser);
	    
	    //不要となったセッションスコープ内のインスタンスの削除
	    session.removeAttribute(registerUser);
	    
	    //登録後のフォワードの設定
	    forwardPath="/WEB-INF/jsp/registerDone.jsp";
	}
	//設定されたフォワード先にフォワード
	RequestDispatcher dispatcher =
			request.getRequest(forwardPath);
	dispatcher.forward(request,response);
}
    protected void doPost(HttpServletRequest request,
    		HttpServeletResponse response)
            throws ServletException, IOException{
    	
    	//リクエストパラメータの取得
    	request.setCharacterEncording("UTF-8");
    	String password = request.getParameter("password");
    	String userName = request.getParameter("name");
    	String email = request.getParameter("email");
    	String birthday = request.getParameter("birthday");
    	String gender = request.getParameter("gender");
    	
    	//登録するユーザー情報の設定
    	User registerUser = new User(password,userName,email,birthday,gender);
    	
    	//セッションスコープに登録ユーザー情報を保存
    	HttpSession session = request.getSession();
    	session.setAttribute("registerUse","registerUser");
    	
    	//フォワード
    	RequestDispatcher dispatcher =
    			request = getRequestDispatcher
    			("/WEB-INF/jsp/rigisterConfirm.jsp");
    	dispatcher.forward(request,response);
    }
}
