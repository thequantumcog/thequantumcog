{*<img src="https://raw.githubusercontent.com/thequantumcog/thequantumcog/output/github-contribution-grid-snake.svg" />
<p align="center"><a href="https://github.com/thequantumcog">
  <img align="center" src="https://github-readme-stats.vercel.app/api?username=thequantumcog&show_icons=true&theme=transparent&hide=contribs" />
</a></p>*}
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
  - Blog   : <https://blog.thisjust.rocks>
