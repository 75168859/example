package cn.pattern.canfei1;

/**
 * 处理聚餐费用申请的对象----》完全的面向过程的操作
 * 对处理进行抽象
 *    --->项目经理的处理
 *    --->部门经理的处理
 *    
 *    --->总经理的处理
 *    
 * 包装好责任链--->提供给用户使用
 * 请求的使用者和处理这解耦
 * 将来责任发生变化，只需要动态添加责任，修改责任链条。
 * 
 */
public class FeeRequest {
	/**
	 * 提交聚餐费用申请给项目经理
	 * 
	 * @param user
	 *            申请人
	 * @param fee
	 *            申请费用
	 * @return 成功或失败的具体通知
	 */
	public String requestToProjectManager(String user, double fee) {
		String str = "";
		if (fee < 500) {
			// 项目经理的权限比较小，只能在500 以内
			str = this.projectHandle(user, fee);
		} else if (fee < 1000) {
			// 部门经理的权限只能在1000 以内
			str = this.depManagerHandle(user, fee);
		} else if (fee >= 1000) {
			// 总经理的权限很大，只要请求到了这里，他都可以处理
			str = this.generalManagerHandle(user, fee);
		}
		return str;
	}

	/**
	 * 项目经理审批费用申请，参数、返回值和上面是一样的，省略了
	 */
	private String projectHandle(String user, double fee) {
		String str = "";
		// 为了测试，简单点，只同意小李的
		if ("小李".equals(user)) {
			str = "项目经理同意" + user + "聚餐费用" + fee + "元的请求";
		} else {
			// 其他人一律不同意
			str = "项目经理不同意" + user + "聚餐费用" + fee + "元的请求";
		}
		return str;
	}

	/**
	 * 部门经理审批费用申请，参数、返回值和上面是一样的，省略了
	 */
	private String depManagerHandle(String user, double fee) {
		String str = "";
		// 为了测试，简单点，只同意小李申请的
		if ("小李".equals(user)) {
			str = "部门经理同意" + user + "聚餐费用" + fee + "元的请求";
		} else {
			// 其他人一律不同意
			str = "部门经理不同意" + user + "聚餐费用" + fee + "元的请求";
		}
		return str;
	}

	/**
	 * 总经理审批费用申请，参数、返回值和上面是一样的，省略了
	 */
	private String generalManagerHandle(String user, double fee) {
		String str = "";

		// 为了测试，简单点，只同意小李的
		if ("小李".equals(user)) {
			str = "总经理同意" + user + "聚餐费用" + fee + "元的请求";
		} else {
			// 其他人一律不同意
			str = "总经理不同意" + user + "聚餐费用" + fee + "元的请求";
		}
		return str;
	}
	
	
	

}