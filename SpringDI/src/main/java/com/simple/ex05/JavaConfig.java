package com.simple.ex05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simple.ex01.Hello;
import com.simple.ex02.Chef;
import com.simple.ex02.Hotel;
import com.simple.ex03.DataSource;
import com.simple.ex03.MemberDAO;


@Configuration // 스프링의 설정파일로 쓰겠다는 뜻.
public class JavaConfig {

   // <bean class=com.simple.ex01.Hello" id="gildong"/>
   @Bean
   public Hello gildong() {
      return new Hello();
   }

//   <bean class="com.simple.ex02.Chef" id="chef" />
//   <bean class="com.simple.ex02.Hotel" id="hotel">
//      <constructor-arg ref="chef"/>
//   </bean>
   @Bean
   public Chef chef() {
      return new Chef();
   }

   @Bean
   public Hotel hotel() {
      return new Hotel(chef()); //Hotel이 chef를 참조함
   }
   
   
//   <bean class="com.simple.ex03.DataSource" id="dataSource">
//   <!--<property name="문자열" ref="객체" value="실제값"/>-->
//   <property name="url" value="오라클주소"/>
//   <property name="uid" value="jsp"/>
//   <property name="upw" value="1234"/>
//   </bean>
   @Bean
   public DataSource dataSource() {
      DataSource dataSource = new DataSource();
      dataSource.setUrl("postgres주소");
      dataSource.setUid("abc123");
      dataSource.setUpw("1234");
      return dataSource;
   }
   
	   /* 250325 숙제 */
	// <bean class="com.simple.ex03.MemberDAO" id="memberDAO">
	// <property name="dataSource" ref="dataSource"/>
	// </bean>
	 
	 //main에서 확인
	 @Bean
	 public MemberDAO memberDao() {
	     MemberDAO memberDAO = new MemberDAO();
	     memberDAO.setDataSource(dataSource()); 
	     return memberDAO;
	 }

   
   
}
