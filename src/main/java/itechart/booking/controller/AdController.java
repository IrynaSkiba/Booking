package itechart.booking.controller;

import itechart.booking.MyResponse;
import itechart.booking.dto.AdDto;
import itechart.booking.model.Ad;
import itechart.booking.service.impl.AdServiceImpl;
import itechart.booking.service.impl.AmenityServiceImpl;
import itechart.booking.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdController {
    @Autowired
    private AdServiceImpl adService;
    @Autowired
    private AmenityServiceImpl amenityService;
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/ads")
    public String createAd(@RequestBody AdDto adDto) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }

        Ad ad = adService.createAd(adDto, amenityService.saveAmenity(adDto.getAmenityDto()),
                userService.findByLogin(username));
        MyResponse<Ad> response = new MyResponse<>(0,ad);
        return response.toString();
    }
}
