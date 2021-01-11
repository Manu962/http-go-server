import  java.util.Date;
@RestController
public class TestController {

@GetMapping("/")
public ResponseEntity<String> home () {
   return new ResponseEntity<String> (body:"Hello!", HttpStatus.OK):
   }
   
   @GetMapping("/healthz")
   public ResponseEntity<TestModel1> healthz(){
   TestModel1 model = newTestModel1(status:"OK",version:"0.0.1",new Timestamp(new Date() .getTime()));
   return new REsponseEntity<>(model,HttpsStatus.OK);
   }
   }
