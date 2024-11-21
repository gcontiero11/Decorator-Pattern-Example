# Decorator Pattern - Implementação no Projeto

O **Decorator Pattern** é usado neste projeto para **adicionar** funcionalidades a objetos dinamicamente, em tempo de execução (`Runtime`). O exemplo foca em um sistema de notificações, onde diferentes tipos de notificadores podem ser combinados em tempo de execução.

---

## Estrutura do Código

### 1. Interface Principal (`Notifier`)
Define o método básico que todas as classes de notificação devem implementar:

```java
public interface Notifier {
    void notify(String message);
}
```

### 2. Implementação Base (`BaseNotifierDecorator`)
Classe abstrata que implementa a interface Notifier e delega chamadas ao objeto "envolvido" (wrapped):
```java
public abstract class BaseNotifierDecorator implements Notifier {
    Notifier wrappedNotifier;

    public BaseNotifierDecorator(Notifier wrappedNotifier) {
        this.wrappedNotifier = wrappedNotifier;
    }

    @Override
    public abstract void notify(String message);
}
```

### 3. Decorator Específicos
Cada decorator adiciona sua própria funcionalidade antes de delegar a notificação:
- `EmailNotifierDecorator`:
  ```java
  public void notify(String message) {
    EmailNotifierService service = new EmailNotifierService();
    service.notify(message);
    wrappedNotifier.notify(message);
  }
  ```
- `WhatsappNotifierDecorator`:
  ```java
  public void notify(String message) {
    WhatsappNotifierService service = new WhatsappNotifierService();
    service.notify(message);
    wrappedNotifier.notify(message);
  }
  ```
- `SuapNotifierDecorator`:
  ```java
  public void notify(String message) {
        SuapNotifierService service = new SuapNotifierService();
        service.notify(message);
        wrappedNotifier.notify(message);
  }
  ```
