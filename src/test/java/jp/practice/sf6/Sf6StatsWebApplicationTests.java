package jp.practice.sf6;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class Sf6StatsWebApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void healthEndpointReturnsUp() throws Exception {
        mockMvc.perform(get("/api/health"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("UP"));
    }

    @Test
    void homepageIsServedFromProjectRoot() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(forwardedUrl("index.html"));

        mockMvc.perform(get("/index.html"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("backend-status")));
    }

    @Test
    void rootPagesAndAssetsAreServed() throws Exception {
        mockMvc.perform(get("/pages/characters.html"))
                .andExpect(status().isOk());
        mockMvc.perform(get("/pages/statistics.html"))
                .andExpect(status().isOk());
        mockMvc.perform(get("/css/style.css"))
                .andExpect(status().isOk());
        mockMvc.perform(get("/js/main.js"))
                .andExpect(status().isOk());
        mockMvc.perform(get("/components/header.html"))
                .andExpect(status().isOk());
    }

    @Test
    void nestedWebsiteFilesRemainAvailable() throws Exception {
        mockMvc.perform(get("/sf6-stats-web/index.html"))
                .andExpect(status().isOk());
        mockMvc.perform(get("/sf6-stats-web/pages/characters.html"))
                .andExpect(status().isOk());
        mockMvc.perform(get("/sf6-stats-web/css/style.css"))
                .andExpect(status().isOk());
    }
}
