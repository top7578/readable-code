# Readable Code

## LSP

- 상속 구조에서, 부모 클래스의 인스턴스를 자식 클래스의 인스턴스로 치환할 수 있어야 한다.
-> 자식 클래스는 부모 클래스의 책임을 준수하며, 부모 클래스의 행동을 변경하지 않아야 한다.

- LSP를 위반하면, 상속 클래스를 사용할 때 오동작, 예상 밖의 예외가 발생하거나, 이를 방지하기 위한 불필요한 타입 체크가 동반될 수 있다.

## ISP

- 클라이언트는 자신이 사용하지 않는 인터페이스에 의존하면 안 된다. 
-> 인터페이스를 잘게 쪼개라!
- ISP를 위반하면, 불필요한 의존성으로 인해 결합도가 높아지고, 특정 기능의 변경이 여러 클래스에 영향을 미칠 수 있다.

## DIP

- 상위 수준의 모듈은 하위 수준의 모듈에 의존해서는 안 된다.
  둘 모두 추상화에 의존해야 한다.
- 의존성의 순방향: 고수준 모듈이 저수준 모듈을 참조하는 것
  의존성의 역방향: 고수준, 저수준 모듈이 모두 추상화에 의존하는 것
  -> 저수준 모듈이 변경되어도, 고수준 모듈에는 영향이 가지 않는다.