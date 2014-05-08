package london.sewell.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StubController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/**", method = RequestMethod.POST)
    public @ResponseBody String postStub(@RequestBody String content) throws Exception {
        logger.debug("Request Method: POST");
        logger.debug("Request Body:\n{}", content);
        return content;
    }

    @RequestMapping(value = "/**", method = RequestMethod.GET)
    public @ResponseBody String getStub(@RequestBody String content) throws Exception {
        logger.debug("Request Method: POST");
        logger.debug("Request Body:\n{}", content);
        return content;
    }
    @RequestMapping(value = "/**", method = RequestMethod.PATCH)
    public @ResponseBody String patchStub(@RequestBody String content) throws Exception {
        logger.debug("Request Method: POST");
        logger.debug("Request Body:\n{}", content);
        return content;
    }
    @RequestMapping(value = "/**", method = RequestMethod.PUT)
    public @ResponseBody String putStub(@RequestBody String content) throws Exception {
        logger.debug("Request Method: POST");
        logger.debug("Request Body:\n{}", content);
        return content;
    }
    @RequestMapping(value = "/**", method = RequestMethod.DELETE)
    public @ResponseBody String deleteStub(@RequestBody String content) throws Exception {
        logger.debug("Request Method: POST");
        logger.debug("Request Body:\n{}", content);
        return content;
    }

}
