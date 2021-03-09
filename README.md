# kotlin-lotto

## 기능 명세서

- 사용자에게 입력을 받는다.
- 입력 중에 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
    - "//" 뒤와 "\n" 사이에 오는 문자는 구분자이다.
    - 구분자는 여러 개일 수 있다.
- 구분자로 분리된 숫자들의 합을 구한다.
    - 음수인 경우 예외처리한다.
    - 숫자 이외의 값인 경우 예외처리한다.
