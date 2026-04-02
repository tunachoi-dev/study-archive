# What are markup languages?
## 1. 마크업 언어 (Markup Languages)란?
텍스트에 **의미(Semantics)나 구조(Structure)** 를 부여하기 위해 태그(Tag) 또는 기호를 사용하는 언어.

프로그래밍 언어(로직, 연산)와 다르게 **데이터를 표현하고 구조화**하는 것이 목적.

---
## 2. 대표적인 Markup Languages
### HTML (HyperText Markup Language)
- 목적: 웹 페이지의 구조와 콘텐츠를 정의
- 특징
	- 브라우저가 해석해서 화면에 렌더링
	- 태그는 대소문자를 구분하지 않지만 소문자 권장
	- 닫는 태그가 없는 **void element**가 존재 (`<br>`, <`img>`, `<input>` 등)
	- 시맨틱 태그로 의미를 부여 (`<header>`, `<nav>`, `<article>`, `section>`, `footer>`)

```html
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <title>페이지 제목</title>
  </head>
  <body>
    <h1>제목</h1>
    <p>본문 내용</p>
  </body>
</html>
```
---
### XML (eXtensible Markup Language)
- 목적: 데이터를 저장하고 전송하기 위한 범용 구조화 언어
- 특징
	- 태그를 개발자가 **직접 정의** (정해진 태그가 없음)
	- 대소문자를 **엄격하게 구분**
	- 모든 태그는 반드시 닫혀야 함
	- 데이터 표현이 목직이므로 브라우저가 렌더링하지 않음
	- 현재는 많은 영역에서 JSON으로 대체되었으나, **Android 레이아웃, Maven/Gradle 설정, SOAP API** 등에서 여전히 사용

```xml
<?xml version="1.0" encoding="UTF-8"?>
<users>
	<user id="1">
		<name>tunachoi-dev</name>
		<age>28</age>
	</user>
</users>
```
---
### Markdown
- 목적: 읽기 쉬운 평문으로 서식 있는 문서를 작성
- 특징
	- 태그 대신 **기호**로 서식 표현 (`#`, `*`, `-` 등)
	- HTML로 변환되어 렌더링됨
	- 별도의 에디터 없이 **일반 텍스트 편집기**로 작성 가능
	- GitHub, Notion, 기술 문서에서 광범위하게 사용
	- 표준이 분산되어 있어 플랫폼마다 문법이 약간씩 다름

```markdown
# 제목 1
## 제목 2

**굴게**, *기울임*, `코드`

- 항목 1
- 항목 2
  
[링크텍스트](https://github.com)
```
