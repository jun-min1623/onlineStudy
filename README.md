# onlineStudy
심심해서 이것저것 써보는 토이프로젝트

# Idea
내 화면을 실시간으로 확인하여 깃헙/intellij/독서실사이트 가 아니면 공부하게 유도하자

## what I use
* Docker, kubernetes, SpringBoot, Aws, Vue.js , Nginx

## why?
* 신기한걸 써보는거에 이유는 없다!!

## how?
* 혼자서 무작정 시작해보기

## 프로젝트 단계 ( prototype )
### 프로젝트 구조 설정 
 * docker 위에 간단한 Db, Spring Boot 얹히기.
 * kubernetes의 경우, 책을 통해 아직 공부중임으로 추후 수정 ( 참고 서적 : 도커/쿠버네티스를 활용한 컨테이너 개발 실전 입문 현장에서 바로 활용할 수 있는 컨테이너 개발 기법과 실전 기술
http://www.yes24.com/Product/Goods/70893433 )
 * Front 는 익숙한 vue로!
 * Nginx 사용

### 프로젝트 단계
1. 환경설정
 * local 에 도커, kubernetes, vue cli 설치
 * 깃헙 레포 연동
 
2. Db 설계
 * schema, data model 설계
 * 간단한 api 정도는 설계해봐도 괜찮을듯 싶다

3.docker 설정
 * 각 컴포넌트 설정
 * hub 나 ecr 에 이미지 빌드/푸쉬해보기

4. 쿠버네티스 배포 manifest 만들기
5. 배포 설정
 * 쿠버네티스 클러스터 설정, 네트워크 세팅

6. 깃헙 액션
7. 테스트

### 추가 고려사항
* 화면 공유 -> 전부 실시간으로 받으면 문제. 다른 방법으로 고민. 현재는 10분씩 체크하여 open ai 도 써보고.. 이것저것 써보기
* webRtc 사용 고려중. vue3 에는 npm webrtc를 지원하는데, 
