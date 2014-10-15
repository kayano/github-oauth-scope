package com.base.jenkins.plugins.githuboauthscope;

import hudson.Extension;
import org.jenkinsci.plugins.GitHubOAuthScope;

import java.util.*;

@Extension
public class GitHubOAuthScopeImpl extends GitHubOAuthScope {

    @Override
    public Collection<String> getScopesToRequest() {
        List<String> scopes = new ArrayList<String>();
        scopes.add("read:org");
        return scopes;
    }

}
