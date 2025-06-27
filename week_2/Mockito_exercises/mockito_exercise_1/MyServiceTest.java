package mockito_exercise_1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {	
        // Step 1: Create a mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject the mock into the service
        MyService service = new MyService(mockApi);

        // Step 4: Call the method and assert the result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
