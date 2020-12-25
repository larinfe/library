package rest;


import org.springframework.beans.factory.annotation.Autowired;

//@RestController
//@RequestMapping("/api")
//public class BookController {
//    private UserService userService;
//
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/book/{id}")
//    public ResponseEntity<UserDto> getUser(@PathVariable Integer id) {
//        return userService.findById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//}
