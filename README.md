# SPRING PLUS

___

## 인스턴스 요약 정보(탄력적 IP)

![img_1.png](img_1.png)

## 인스턴스 보안 그룹 규칙

![img.png](img.png)

___

## RDS 연결된 컴퓨팅 리소스

![img_2.png](img_2.png)

## RDS 보안 그룹 규칙

![img_3.png](img_3.png)

___

## S3 퍼블릭 액세스 차단

![img_4.png](img_4.png)

## S3 버킷 정책

![img_5.png](img_5.png)

## S3 객체 소유권

![img_6.png](img_6.png)

___

## 추가된 API

| Method | URL                                   | Description     | Parameters                                       | Request Body | Response                                                                                                                                                                                                                                 | Status Code |
|--------|---------------------------------------|-----------------|--------------------------------------------------|--------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| GET    | http://localhost:8080/actuator/health | 서버 health check | 없음                                               | 없음           | { <br/>"status" : 서버 상태 <br/>}                                                                                                                                                                                                           | 200 OK      |
| PUT    | http://localhost:8080/users/profile   | 프로필 이미지 업로드     | ?image=프로필이미지                                    | 없음           | { <br/>"imageUrl" : 이미지 URL <br/>}                                                                                                                                                                                                       | 200 OK      |     
| DELETE | http://localhost:8080/users/profile   | 프로필 이미지 삭제      | 없음                                               | 없음           | 없음                                                                                                                                                                                                                                       | 200 OK      | 
| GET    | http://localhost:8080/users           | 유저 닉네임 검색       | ?page=페이지번호&<br/>size=페이지사이즈&<br/>nickname=유저닉네임 | 없음           | { <br/>"content" : [<br/>{<br/>"id" : 유저ID, <br/>"email" : 유저email, <br/>"nickname" : 유저닉네임<br/>}<br/>],<br/>"page" : {<br/>"size" : 페이지사이즈, <br/>"number" : 페이지번호, <br/>"totalElements" : 조회된유저수, <br/>"totalPages" : 전체페이지수<br/>}<br/> | 200 OK      |

___

## 유저 닉네임 조회 성능개선(ms)

![img_9.png](img_9.png)

![img_10.png](img_10.png)