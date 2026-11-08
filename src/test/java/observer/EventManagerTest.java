package observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

@ExtendWith(MockitoExtension.class)
class EventManagerTest {
    private EventManager<String> eventManager;

    // @Mock is the alternative to Observer<String> observer = mock(Observer.class);
    @Mock
    private Observer<String> observer;

    @BeforeEach
    void setUp() {
        // MockitoAnnotations.openMocks(this); is the alternative to @ExtendWith(MockitoExtension.class)
        eventManager = new EventManager<>();
    }

    @Test
    void shouldNotifyObserver() {
        eventManager.subscribe(observer);
        eventManager.dispatchEvent("Hello");
        verify(observer).handleEvent("Hello");
    }

    @Test
    void shouldNotNotifyUnsubscribedObserver() {
        eventManager.subscribe(observer);
        eventManager.unsubscribe(observer);
        eventManager.dispatchEvent("Hello");
        verifyNoInteractions(observer);
    }
}