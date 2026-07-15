<img src="https://raw.githubusercontent.com/thequantumcog/thequantumcog/main/dist/github-metrics.svg" />

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### 📰 Recent Blog Posts
{{ range rss "https://thebrink.netlify.app/feed.xml" 5 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}
### 📫 How to reach me:
  - Mastodon   : <https://fosstodon.org/@quantumcog>
  - Blog   : <https://blog.0177417.xyz>

<img src="https://raw.githubusercontent.com/thequantumcog/thequantumcog/output/github-contribution-grid-snake.svg" />
