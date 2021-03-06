package reservation.model.vo;

public class ReservationVO {
									// 사실상 ** 표시가된 변수만 사용될 가능성이 높지만, 그냥 적어놓음 
	private String reserv_no; 		//	예약번호
	private String customer_id; 	// 	고객id
	private String customer_name;	//  고객이름
 	private String site_no; 		// 	사이트 넘버
	private String site_type;		//  사이트 타입
	private String tel;


	private int person_no ; 		// 	인원수  **

	private String reserve_date;	//	예약일
	private String check_in;    	//	체크인
	private String check_out; 		//	체크아웃

	private String car_no; 			//	차번호  **
	private String est_arr_time; 	// 	도착예정 시간 **
	private String status; 			//	상태 
	private String manager_id; 		//	직원id
	private String RequestTerm; 	//	요청사항
	private int price; 				//  요금
	

	public ReservationVO() {
		super();
	}

	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSite_type() {
		return site_type;
	}
	public void setSite_type(String site_type) {
		this.site_type = site_type;
	}
	public String getRequestTerm() {
		return RequestTerm;
	}
	public void setRequestTerm(String requestTerm) {
		RequestTerm = requestTerm;
	}

	public String getReserv_no() {
		return reserv_no;
	}

	public void setReserv_no(String reserv_no) {
		this.reserv_no = reserv_no;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getSite_no() {
		return site_no;
	}

	public void setSite_no(String site_no) {
		this.site_no = site_no;
	}

	public int getPerson_no() {
		return person_no;
	}

	public void setPerson_no(int person_no) {
		this.person_no = person_no;
	}

	public String getReserve_date() {
		return reserve_date;
	}

	public void setReserve_date(String reserve_date) {
		this.reserve_date = reserve_date;
	}

	public String getCheck_in() {
		return check_in;
	}

	public void setCheck_in(String check_in) {
		this.check_in = check_in;
	}

	public String getCheck_out() {
		return check_out;
	}

	public void setCheck_out(String check_out) {
		this.check_out = check_out;
	}

	public String getCar_no() {
		return car_no;
	}

	public void setCar_no(String car_no) {
		this.car_no = car_no;
	}

	public String getEst_arr_time() {
		return est_arr_time;
	}

	public void setEst_arr_time(String est_arr_time) {
		this.est_arr_time = est_arr_time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getManager_id() {
		return manager_id;
	}

	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	
}
