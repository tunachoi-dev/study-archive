# Standart Attributes
HTML 요소에 추가적인 정보나 기능을 부여하는 속성들입니다. 스타일링, 식별, 접근성, 이벤트 처리 등을 제어하며 브라우저와 기기에 관계없이 일관된 방식으로 동작합니다.

---
## 1. `id` attribute
HTML 문서 내에서 **특정 요소를 고유하게 식별**하는 속성입니다.

주요 용도:
- CSS로 특정 요소에 스타일 적용
- JavaScript로 특정 요소 접근 및 조작
- URL에서 특정 위치로 바로 이동 (`#section1`)

```html
<!-- CSS에서 활용 -->
<div id="header">헤더 영역</div>

<!-- JavaScript에서 활용 -->
<p id="title">제목</p>
<script>
	document.getElementById("title").style.color = "blue";
</script>

<!-- URL 링크에서 활용 -->
<a href="#section1">섹션1으로 이동</a>
<h2 id="section1">섹션1</h2>
```
`id` 값은 하나의 HTML 문서 안에서 **반드시 고유**해야 합니다. 같은 id를 여러 요소에 사용하면 CSS와 JavaScript가 올바르게 동작하지 않습니다.

---
## 2. `class` attribute
하나 이상의 클래스 이름을 요소에 지정하는 속성입니다. `id`와 달리 **여러 요소가 같은 클래스를 공유**할 수 있어 그룹 단위로 스타일링하거나 조작할 때 사용합니다.

```html
<!-- 여러 요소에 같은 클래스 적용 -->
<p class="highlight">첫 번째 강조 문장</p>
<p class="highlight">두 번째 강조 문장</p>

<!-- 하나의 요소에 여러 클래스 적용 -->
<p class="highlight bold">강조 + 굵게</p>
```
	id는 문서에서 하나, class는 여러 요소에 중복 사용 가능 - 이 차이가 핵심입니다.

---
## 3. `data` attribute
`data-`로 시작하는 사용자 정의 속성으로, HTML 요소 안에 **추가 데이터를 직접 저장**할 때 사용합니다. 검색엔진이나 외부 서비스에는 노출되지 않으며, JavaScript로 해당 데이터에 접근해 동적인 기능을 구현할 때 활용합니다.

```html
<!-- data-속성명 형식으로 자유롭게 이름 지정 -->
<button data-user-id="42" data-role="admin">관리자 버튼</button>

<script>
	const btn = document.querySelector("button");
	console.log(btn.dataset.userId);  // "42"
	console.log(btn.dataset.role);    // "admin"
</script>
```

자세한 내용을 추후에 JavaScript에서 배울 예정입니다.

---
## 4. `style` attribute
CSS를 HTML 요소에 **직접(인라인으로) 적용**하는 속성입니다. 외부 스타일시트나 브라우저 기본 스타일보다 우선순위가 높습니다.

```html
<p style="color: red; font-seize: 18px;">빨간색 텍스트</p>
<div style="background-color: yellow; padding: 10px">배경색 적용</div>
```
**주의:** `style` 속성은 빠른 테스트엔 편리하지만, 실제 프로젝트에서는 유지보수가 어려워지므로 **외부 CSS 파일 사용을 권장**합니다.

---
# 정리
| 속성       | 용도           | 중복 사용        |
| -------- | ------------ | ------------ |
| `id`     | 요소 고유 식별     | 문서 내 유일해야 함  |
| `class`  | 그룹 스타일링 / 조작 | 여러 요소 공유 가능  |
| `data-*` | 커스텀 데이터 저장   | 자유롭게 정의      |
| `style`  | 인라인 CSS 적용   | 모든 요소에 사용 가능 |
