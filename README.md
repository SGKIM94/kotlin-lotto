
# kotlin-lotto

## 기능 명세서

### 문자열 계산기
- 사용자에게 입력을 받는다.
- 입력 중에 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
    - "//" 뒤와 "\n" 사이에 오는 문자는 구분자이다.
    - 구분자는 여러 개일 수 있다.
- 구분자로 분리된 숫자들의 합을 구한다.
    - 음수인 경우 예외처리한다.
    - 숫자 이외의 값인 경우 예외처리한다.


### 로또
- 금액을 입력받는다.
- 로또를 발급한다.
    - 로또는 가격을 가진다.
    - 로또의 한장 가격은 1000원이다.
    - 로또는 6개의 랜덤 숫자를 가진다.
    - 입력 개수에 따라 금액을 저장한다.
    - 입력 개수만큼 로또를 생성한다.
- 당첨 번호를 입력받는다.
- 로또 번호와 당첨번호를 비교하여 3,4,5,6개 각각 일치하는 것을 찾는다.
- 당첨금액과 구매금액을 비교하여 수익율을 계산한다.
