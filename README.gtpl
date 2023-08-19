<img src="https://raw.githubusercontent.com/ardrag0n/ardrag0n/output/github-contribution-grid-snake.svg" />
<p align="center"><a href="https://github.com/anuraghazra/github-readme-stats">
  <img align="center" src="github-readme-stats-zeta-eight-79.vercel.app/api?username=ardrag0n&show_icons=true&theme=transparent&hide=contribs" />
</a></p>


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
  - Twitter   : <https://twitter.com/ar0177417>
  - Blog   : <https://thebrink.netlify.app>
